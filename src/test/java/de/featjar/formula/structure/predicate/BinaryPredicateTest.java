package de.featjar.formula.structure.predicate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static de.featjar.formula.structure.Expressions.constant;

import org.junit.jupiter.api.Test;

import de.featjar.formula.structure.predicate.LessEqual;
import de.featjar.formula.structure.term.ITerm;
import de.featjar.formula.structure.term.value.Constant;
import de.featjar.formula.structure.term.value.Variable;

import de.featjar.formula.structure.ATerminalExpression;
import de.featjar.formula.structure.IExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;


public class BinaryPredicateTest {
	
	@Test
	void testLessEqual() {
		LessEqual lessEqual = new LessEqual();
		
		int smallTerm = 7;
		int bigTerm = 100;
		List<Integer> lessThanExpression = new ArrayList<>();
		lessThanExpression.add(smallTerm);
		lessThanExpression.add(bigTerm);
		assertTrue(lessEqual.evaluate(lessThanExpression).isPresent());
		assertTrue(lessEqual.evaluate(lessThanExpression).get());
		
	}

}
