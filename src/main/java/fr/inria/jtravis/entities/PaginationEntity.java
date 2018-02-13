package fr.inria.jtravis.entities;

import com.google.gson.annotations.Expose;

import java.util.Objects;

public class PaginationEntity extends Entity {
    @Expose
    private int limit;

    @Expose
    private int offset;

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        PaginationEntity that = (PaginationEntity) o;
        return limit == that.limit &&
                offset == that.offset;
    }

    @Override
    public int hashCode() {

        return Objects.hash(super.hashCode(), limit, offset);
    }

    @Override
    public String toString() {
        return "PaginationEntity{" +
                "limit=" + limit +
                ", offset=" + offset +
                '}';
    }
}
