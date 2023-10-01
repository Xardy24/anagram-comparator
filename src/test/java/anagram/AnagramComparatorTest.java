package anagram;

import java.util.List;

import anagram.service.AnagramComparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AnagramComparatorTest {

    @Test
    public void testAreAnagrams_PositiveCase() {
        AnagramComparator comparator = new AnagramComparator();
        assertTrue(comparator.areAnagrams("listen", "silent"));
    }

    @Test
    public void testAreAnagrams_NegativeCase() {
        AnagramComparator comparator = new AnagramComparator();
        assertFalse(comparator.areAnagrams("hello", "world"));
    }

    @Test
    public void testFindAllAnagrams() {
        AnagramComparator comparator = new AnagramComparator();
        // String A
        comparator.addString("listen");
        // String B
        comparator.addString("silent");
        // String C
        comparator.addString("triangle");
        // String D
        comparator.addString("lisent");

        List<String> anagramsOfListen = comparator.findAllAnagrams("listen");
        List<String> anagramsOfSilent = comparator.findAllAnagrams("silent");
        List<String> anagramsOfTriangle = comparator.findAllAnagrams("triangle");

        // Feature #2 Test Cases
        assertEquals(anagramsOfListen, List.of("silent", "lisent"));
        assertEquals(anagramsOfSilent, List.of("listen", "lisent"));
        assertEquals(anagramsOfTriangle, List.of());
    }
}
