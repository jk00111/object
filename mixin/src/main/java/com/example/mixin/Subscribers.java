package com.example.mixin;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class Subscribers implements ListMixin<Subscriber>{

    private List<Subscriber> subscribers;

    @Override
    public List<Subscriber> getRecords() {
        return subscribers;
    }

    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }

    public List<Subscriber> primeSubscribers() {
        // 프라임 구독자 반환 로직
        return null;
    }

    @Override
    public int size() {
        return ListMixin.super.size();
    }

    @Override
    public boolean isEmpty() {
        return ListMixin.super.isEmpty();
    }

    @Override
    public void replaceAll(UnaryOperator<Subscriber> operator) {
        ListMixin.super.replaceAll(operator);
    }

    @Override
    public void sort(Comparator<? super Subscriber> c) {
        ListMixin.super.sort(c);
    }

    @Override
    public Spliterator<Subscriber> spliterator() {
        return ListMixin.super.spliterator();
    }

    @Override
    public <T> T[] toArray(IntFunction<T[]> generator) {
        return ListMixin.super.toArray(generator);
    }

    @Override
    public boolean removeIf(Predicate<? super Subscriber> filter) {
        return ListMixin.super.removeIf(filter);
    }

    @Override
    public Stream<Subscriber> stream() {
        return ListMixin.super.stream();
    }

    @Override
    public Stream<Subscriber> parallelStream() {
        return ListMixin.super.parallelStream();
    }

    @Override
    public void forEach(Consumer<? super Subscriber> action) {
        ListMixin.super.forEach(action);
    }

    public Subscribers() {
        super();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override
    public boolean contains(Object o) {
        return false;
    }

    @Override
    public Iterator<Subscriber> iterator() {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(Subscriber subscriber) {
        return false;
    }

    @Override
    public boolean remove(Object o) {
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends Subscriber> c) {
        return false;
    }

    @Override
    public boolean addAll(int index, Collection<? extends Subscriber> c) {
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {

    }

    @Override
    public Subscriber get(int index) {
        return null;
    }

    @Override
    public Subscriber set(int index, Subscriber element) {
        return null;
    }

    @Override
    public void add(int index, Subscriber element) {

    }

    @Override
    public Subscriber remove(int index) {
        return null;
    }

    @Override
    public int indexOf(Object o) {
        return 0;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<Subscriber> listIterator() {
        return null;
    }

    @Override
    public ListIterator<Subscriber> listIterator(int index) {
        return null;
    }

    @Override
    public List<Subscriber> subList(int fromIndex, int toIndex) {
        return null;
    }
}
