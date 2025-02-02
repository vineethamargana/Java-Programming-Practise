/*
  DIFFERENCE BETWEEN STRING BUFFER AND STRING BUILDER:
  STRING BUILDER:
  1.All the methods in the string buffer are non synchronized
  2.Non thread safe class
  3.multiple threads can access
  4.race condition will occur
  5.slower 
  6.dead lock will occur
  
  STRING BUFFER:
 1. All the methods in the string buffer are synchronized.
 2. thread safe class
 3. singke thread can access
 4.race - condition will not exist
 5.faster
 6.dead lock will not occur
 
 
 */

package corejavamultithreading;

public class DiffebwnStringBufferandStringBuilder {

}
StringBuffer