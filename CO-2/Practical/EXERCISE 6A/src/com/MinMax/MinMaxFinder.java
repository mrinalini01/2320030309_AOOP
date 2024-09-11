package com.MinMax;

//Generic Interface
interface MinMaxFinder<T extends Comparable<T>> {
	T findMin(T[] array);
	T findMax(T[] array);
}

