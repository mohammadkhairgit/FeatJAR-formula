/*
 * Copyright (C) 2025 FeatJAR-Development-Team
 *
 * This file is part of FeatJAR-formula.
 *
 * formula is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3.0 of the License,
 * or (at your option) any later version.
 *
 * formula is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with formula. If not, see <https://www.gnu.org/licenses/>.
 *
 * See <https://github.com/FeatureIDE/FeatJAR-formula> for further information.
 */
package de.featjar.formula.structure.predicate;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class BinaryPredicateTest {

    @Test
    void testLessEqual() {
        LessEqual lessEqual = new LessEqual();
        assertTrue(lessEqual.evaluate(Arrays.asList(7, 100)).isPresent());
        assertTrue(lessEqual.evaluate(Arrays.asList(7, 100)).get());

        assertTrue(lessEqual.evaluate(Arrays.asList(123, 100)).isPresent());
        assertFalse(lessEqual.evaluate(Arrays.asList(123, 100)).get());

        assertTrue(lessEqual.evaluate(Arrays.asList(123, 123)).isPresent());
        assertTrue(lessEqual.evaluate(Arrays.asList(123, 123)).get());

        assertFalse(lessEqual.evaluate(Arrays.asList(123, null)).isPresent());
        assertFalse(lessEqual.evaluate(Arrays.asList(null, 123)).isPresent());
        assertFalse(lessEqual.evaluate(Arrays.asList(null, null)).isPresent());
    }

    @Test
    void testEquals() {
        Equals equals = new Equals();

        assertTrue(equals.evaluate(Arrays.asList(7, 100)).isPresent());
        assertFalse(equals.evaluate(Arrays.asList(7, 100)).get());

        assertTrue(equals.evaluate(Arrays.asList(123, 100)).isPresent());
        assertFalse(equals.evaluate(Arrays.asList(123, 100)).get());

        assertTrue(equals.evaluate(Arrays.asList(123, 123)).isPresent());
        assertTrue(equals.evaluate(Arrays.asList(123, 123)).get());

        assertFalse(equals.evaluate(Arrays.asList(123, null)).isPresent());
        assertFalse(equals.evaluate(Arrays.asList(null, 123)).isPresent());
        assertFalse(equals.evaluate(Arrays.asList(null, null)).isPresent());
    }

    @Test
    void testLess() {
        LessThan lessThan = new LessThan();

        assertTrue(lessThan.evaluate(Arrays.asList(7, 100)).isPresent());
        assertTrue(lessThan.evaluate(Arrays.asList(7, 100)).get());

        assertTrue(lessThan.evaluate(Arrays.asList(123, 100)).isPresent());
        assertFalse(lessThan.evaluate(Arrays.asList(123, 100)).get());

        assertTrue(lessThan.evaluate(Arrays.asList(123, 123)).isPresent());
        assertFalse(lessThan.evaluate(Arrays.asList(123, 123)).get());

        assertFalse(lessThan.evaluate(Arrays.asList(123, null)).isPresent());
        assertFalse(lessThan.evaluate(Arrays.asList(null, 123)).isPresent());
        assertFalse(lessThan.evaluate(Arrays.asList(null, null)).isPresent());
    }

    @Test
    void testGreaterEqual() {
        GreaterEqual greaterEqual = new GreaterEqual();

        assertTrue(greaterEqual.evaluate(Arrays.asList(7, 100)).isPresent());
        assertFalse(greaterEqual.evaluate(Arrays.asList(7, 100)).get());

        assertTrue(greaterEqual.evaluate(Arrays.asList(123, 100)).isPresent());
        assertTrue(greaterEqual.evaluate(Arrays.asList(123, 100)).get());

        assertTrue(greaterEqual.evaluate(Arrays.asList(123, 123)).isPresent());
        assertTrue(greaterEqual.evaluate(Arrays.asList(123, 123)).get());

        assertFalse(greaterEqual.evaluate(Arrays.asList(123, null)).isPresent());
        assertFalse(greaterEqual.evaluate(Arrays.asList(null, 123)).isPresent());
        assertFalse(greaterEqual.evaluate(Arrays.asList(null, null)).isPresent());
    }

    @Test
    void testNotEquals() {
        NotEquals notEquals = new NotEquals();

        assertTrue(notEquals.evaluate(Arrays.asList(7, 100)).isPresent());
        assertTrue(notEquals.evaluate(Arrays.asList(7, 100)).get());

        assertTrue(notEquals.evaluate(Arrays.asList(123, 100)).isPresent());
        assertTrue(notEquals.evaluate(Arrays.asList(123, 100)).get());

        assertTrue(notEquals.evaluate(Arrays.asList(123, 123)).isPresent());
        assertFalse(notEquals.evaluate(Arrays.asList(123, 123)).get());

        assertFalse(notEquals.evaluate(Arrays.asList(123, null)).isPresent());
        assertFalse(notEquals.evaluate(Arrays.asList(null, 123)).isPresent());
        assertFalse(notEquals.evaluate(Arrays.asList(null, null)).isPresent());
    }

    @Test
    void testGreaterThan() {
        GreaterThan greaterThan = new GreaterThan();

        assertTrue(greaterThan.evaluate(Arrays.asList(7, 100)).isPresent());
        assertFalse(greaterThan.evaluate(Arrays.asList(7, 100)).get());

        assertTrue(greaterThan.evaluate(Arrays.asList(123, 100)).isPresent());
        assertTrue(greaterThan.evaluate(Arrays.asList(123, 100)).get());

        assertTrue(greaterThan.evaluate(Arrays.asList(123, 123)).isPresent());
        assertFalse(greaterThan.evaluate(Arrays.asList(123, 123)).get());

        assertFalse(greaterThan.evaluate(Arrays.asList(123, null)).isPresent());
        assertFalse(greaterThan.evaluate(Arrays.asList(null, 123)).isPresent());
        assertFalse(greaterThan.evaluate(Arrays.asList(null, null)).isPresent());
    }
}
