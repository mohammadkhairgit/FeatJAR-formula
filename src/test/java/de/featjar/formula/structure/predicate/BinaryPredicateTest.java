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
		
		assertTrue(lessEqual.evaluate(List.of(7,100)).get());
		assertFalse(lessEqual.evaluate(List.of(123, 100)).get());
		assertTrue(lessEqual.evaluate(List.of(123, 123)).get());
		
		assertFalse(lessEqual.evaluate(List.of(123, null)).isPresent());
		assertFalse(lessEqual.evaluate(List.of(null,123)).isPresent());
		assertFalse(lessEqual.evaluate(List.of(null, null)).isPresent());
	}
	
	@Test 
	void testEquals() {
		Equals equals = new Equals();
	}

}
