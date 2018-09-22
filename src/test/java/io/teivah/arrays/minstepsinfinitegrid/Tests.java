package io.teivah.arrays.minstepsinfinitegrid;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static io.teivah.utils.Utils.toArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
	@Test
	public void test1() {
		final ArrayList<Integer> x = toArrayList(-7, -13);
		final ArrayList<Integer> y = toArrayList(1, -5);

		assertEquals(new Traversal().coverPoints(x, y), 6);
		assertEquals(new Calculation().coverPoints(x, y), 6);
	}

	@Test
	public void test2() {
		final ArrayList<Integer> x = toArrayList(4, 8, -7, -5, -13, 9, -7, 8);
		final ArrayList<Integer> y = toArrayList(4, -15, -10, -3, -13, 12, 8, -8);

		assertEquals(new Traversal().coverPoints(x, y), 108);
		assertEquals(new Calculation().coverPoints(x, y), 108);
	}
}
