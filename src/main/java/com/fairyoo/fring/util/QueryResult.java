package com.fairyoo.fring.util;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author MengYi at 2019-01-04 10:21
 */
public class QueryResult<T> {
    private static final Collection empty = new ArrayList();
    private int count;
    private Collection<T> items;

    public QueryResult(int count, Collection<T> items) {
        this.items = empty;
        this.count = count;
        this.items = items;
    }

    public QueryResult(int count) {
        this.items = empty;
        this.count = count;
    }

    public QueryResult(Collection<T> items) {
        this.items = empty;
        this.items = items;
    }

    private QueryResult() {
        this.items = empty;
    }

    public int getCount() {
        return this.count;
    }

    public Collection<T> getItems() {
        return this.items;
    }

    public void setCount(final int count) {
        this.count = count;
    }

    public void setItems(final Collection<T> items) {
        this.items = items;
    }

    public boolean equals(final Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof QueryResult)) {
            return false;
        } else {
            QueryResult<?> other = (QueryResult)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getCount() != other.getCount()) {
                return false;
            } else {
                Object this$items = this.getItems();
                Object other$items = other.getItems();
                if (this$items == null) {
                    if (other$items != null) {
                        return false;
                    }
                } else if (!this$items.equals(other$items)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(final Object other) {
        return other instanceof QueryResult;
    }

    @Override
    public int hashCode() {
        boolean PRIME = true;
        int result = 1;
        result = result * 59 + this.getCount();
        Object $items = this.getItems();
        result = result * 59 + ($items == null ? 43 : $items.hashCode());
        return result;
    }

    @Override
    public String toString() {
        return "QueryResult(count=" + this.getCount() + ", items=" + this.getItems() + ")";
    }
}
