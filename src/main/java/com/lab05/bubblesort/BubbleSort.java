package com.lab05.bubblesort;

public class BubbleSort {

    public void bubbleSort(int[] vet) {
        for (int i = vet.length; i >= 2; i--) {      // nodo 2
            for (int j = 0; j < i - 1; j++) {        // nodo 3
                if (vet[j] > vet[j + 1]) {           // nodo 4
                    int aux = vet[j];                // nodo 5
                    vet[j] = vet[j + 1];
                    vet[j + 1] = aux;
                }
            }
        }
    }
}