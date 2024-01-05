package com.academy.Shared;

public interface Usecase<In, Out> {
    Out handle(In in);
}
