package net.almost_done.minechecker;

import java.util.HashSet;

import org.junit.Test;
import static org.junit.Assert.*;

public class PairShould {

  @Test
  public void storeCorrectValues() throws Exception {
    Pair<Integer, Integer>  p1 = getPair(3, 4);
    assertTrue(p1.getFirst() == 3);
    assertTrue(p1.getSecond() == 4);
  }

  @Test
  public void beEqualToItself() throws Exception {
    Pair<Integer, Integer>  p1 = getPair(3, 4);
    assertEquals(p1, p1);
  }
  
  @Test
  public void beEqualToPairWithSameValues() throws Exception {
    Pair<Integer, Integer> p1 = getPair(6, 8);
    Pair<Integer, Integer> p2 = getPair(6, 8);
    assertEquals(p1, p2);
  }

  @Test
  public void notBeEqualToPairWithDifferentValues() throws Exception {
    Pair<Integer, Integer> p1 = getPair(4, 16);
    Pair<Integer, Integer> p2 = getPair(6, 2);
    assertFalse(p1 == p2);
  }
  
  @Test
  public void notBeEqualToPairWithDifferentFirstValue() throws Exception {
    Pair<Integer, Integer> p1 = getPair(4, 5);
    Pair<Integer, Integer> p2 = getPair(6, 5);
    assertFalse(p1 == p2);
  }
  
  @Test
  public void notBeEqualToPairWithDifferentSecondValue() throws Exception {
    Pair<Integer, Integer> p1 = getPair(77, 3);
    Pair<Integer, Integer> p2 = getPair(77, 76);
    assertFalse(p1 == p2);
  }

  @Test
  public void beRecognizedInHashSet() throws Exception {
    Pair<Integer, Integer> p1 = getPair(23, 66);
    Pair<Integer, Integer> p2 = getPair(23, 66);
    HashSet<Pair<Integer, Integer> > hs = new HashSet();
    hs.add(p1);
    assertTrue(hs.contains(p2));
    
  }

  @Test
  public void notCauseFalsePositivesInHashSet() throws Exception {
    Pair<Integer, Integer> p1 = getPair(23, 66);
    Pair<Integer, Integer> p2 = getPair(23, 67);
    HashSet<Pair<Integer, Integer> > hs = new HashSet();
    hs.add(p1);
    assertFalse(hs.contains(p2));
    
  }
  
  /*
   * utility functions
   */
  private Pair<Integer, Integer> getPair(int a, int b){
    return new Pair(a, b);
  }
}
