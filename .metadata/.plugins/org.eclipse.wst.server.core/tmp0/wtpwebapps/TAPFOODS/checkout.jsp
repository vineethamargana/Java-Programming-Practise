<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.tap.model.Cart, com.tap.model.CartItem"%>
<%@ page import="java.util.Map"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Checkout</title>
    <link rel="stylesheet" type="text/css" href="styles/checkout.css">
</head>
<body>
    <div class="container">
        <h2>Checkout</h2>

        <%
        Cart cart = (Cart) session.getAttribute("cart");
        if (cart != null && !cart.getItems().isEmpty()) {
            double total = 0.0;
        %>
        <div class="order-summary">
            <h3>Order Summary</h3>
            <%
            for (Object obj : cart.getItems().entrySet()) {
                Map.Entry<Integer, CartItem> entry = (Map.Entry<Integer, CartItem>) obj;
                CartItem item = entry.getValue();
                double itemSubtotal = item.getSubtotal();
                total += itemSubtotal;
            %>
            <div class="order-item">
                <p>
                    <strong>Item:</strong> <%=item.getName()%><br/>
                    <strong>Quantity:</strong> <%=item.getQuantity()%><br/>
                    <strong>Price:</strong> Rs.<%=item.getPrice()%><br/>
                    <strong>Subtotal:</strong> Rs.<%=itemSubtotal%>
                </p>
            </div>
            <hr/>
            <%
            }
            %>
            <h3>Total: Rs.<%=total%></h3>
        </div>
        
        <form action="confirmOrder.jsp" method="post" class="checkout-form">
            <h3>Shipping Information</h3>
            <p>
                <label for="name">Name:</label>
                <input type="text" name="name" id="name" required>
            </p>
            <p>
                <label for="address">Address:</label>
                <textarea name="address" id="address" required></textarea>
            </p>
            <p>
                <label for="phone">Phone:</label>
                <input type="text" name="phone" id="phone" required>
            </p>
            <p>
                <label for="payment">Payment Method:</label>
                <select name="payment" id="payment" required>
                    <option value="credit">Credit Card</option>
                    <option value="debit">Debit Card</option>
                    <option value="paypal">PayPal</option>
                </select>
            </p>
            <p>
                <input type="submit" value="Confirm Order" class="submit-btn">
            </p>
        </form>
        <%
        } else {
        %>
        <p>Your cart is empty.</p>
        <%
        }
        %>
    </div>
</body>
</html>
