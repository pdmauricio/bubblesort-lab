package com.lab05.bubblesort;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class BubbleSortTest {

    private BubbleSort sorter;

    @BeforeEach
    void setUp() {
        sorter = new BubbleSort();
    }

    @AfterEach
    void tearDown() {
        sorter = null;
    }

    @Test
    @DisplayName("CP1: un elemento | camino 1-2-8")
    void cp1_unElemento() {
        int[] vet = {5};
        sorter.bubbleSort(vet);
        assertArrayEquals(new int[]{5}, vet);
    }

    @Test
    @DisplayName("CP2: ya ordenado, sin intercambio | camino 1-2-3-4-6-3-7-2-8")
    void cp2_yaOrdenado() {
        int[] vet = {1, 2};
        sorter.bubbleSort(vet);
        assertArrayEquals(new int[]{1, 2}, vet);
    }

    @Test
    @DisplayName("CP3: un intercambio | camino 1-2-3-4-5-6-3-7-2-8")
    void cp3_unIntercambio() {
        int[] vet = {2, 1};
        sorter.bubbleSort(vet);
        assertArrayEquals(new int[]{1, 2}, vet);
    }

    @Test
    @DisplayName("CP4: bucles anidados con varias iteraciones")
    void cp4_variasIteraciones() {
        int[] vet = {3, 1, 2};
        sorter.bubbleSort(vet);
        assertArrayEquals(new int[]{1, 2, 3}, vet);
    }
}