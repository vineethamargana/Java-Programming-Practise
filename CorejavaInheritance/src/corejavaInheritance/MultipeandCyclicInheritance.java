
/*
  it is not possible to create multiple inheritance and cyclic inheritance
  MULTIPLE INHERITANCE:
  multiple inheritance also called as diamond path or daimond inheritance
  as it shows daimond shape when we also consider to see the object class
  as the parent class extends from the object class
  
  one class is accuring properties from the multiple parent classes is called multiple inheritance
  ambiguity occurs
  
  CYCLIC INHERITANCE:
  child class extends from parent and parent class extends ffrom child which is not possible
 */

package corejavaInheritance;
//mutiple inheritance 
class Par1
{
	
}
class par2
{
	
}
class Chi1 extends Par1,Par2 //so it is not possible
{
	
}

/*
  CYCLIC INHERITANCE:
  
  class Par3 extends chi3
  {
    
  }
  class chi3 extends par3
   {
   
   }
 */

public class MultipeandCyclicInheritance {

}
