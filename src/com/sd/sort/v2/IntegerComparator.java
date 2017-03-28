package com.sd.sort.v2;
import java.util.*;
class IntegerComparator implements Comparator{
    public IntegerComparator() {}
    public int compare(Object o1, Object o2){
        return (Integer)o1 - (Integer)o2;
    }
}