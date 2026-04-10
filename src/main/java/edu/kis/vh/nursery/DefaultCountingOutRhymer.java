// Projekt przeszedł walidację testami jednostkowymi. Wszystkie testy działają poprawnie.
package edu.kis.vh.nursery;

/**
 * Klasa DefaultCountingOutRhymer stanowi podstawową implementację wyliczanki.
 * Przechowuje liczby w tablicy o stałym rozmiarze.
 */
public class DefaultCountingOutRhymer {

    private static final int CAPACITY = 12;
    private static final int EMPTY_RHYMER_INDICATOR = -1;
    private static final int DEFAULT_VALUE = -1;
    private static final int MAX_CAPACITY_INDEX = CAPACITY - 1;

    private final int[] numbers = new int[CAPACITY];

    private int total = EMPTY_RHYMER_INDICATOR;

    public int getTotal() {
        return total;
    }

    /**
     * Dodaje nową liczbę do wyliczanki, jeśli nie jest pełna.
     * * @param in liczba całkowita do dodania
     */
    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    /**
     * Sprawdza, czy wyliczanka jest pusta.
     * * @return true, jeśli wyliczanka nie zawiera elementów
     */
    public boolean callCheck() {
        return total == EMPTY_RHYMER_INDICATOR;
    }

    /**
     * Sprawdza, czy wyliczanka osiągnęła maksymalną pojemność.
     * @return true, jeśli wyliczanka jest pełna
     */
    public boolean isFull() {
        return total == MAX_CAPACITY_INDEX;
    }

    protected int peekaboo() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return DEFAULT_VALUE;
        return numbers[total--];
    }

}