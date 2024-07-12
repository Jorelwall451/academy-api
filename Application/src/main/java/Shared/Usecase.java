package Shared;

public interface Usecase<In, Out> {
    Out handle(In in);
}
