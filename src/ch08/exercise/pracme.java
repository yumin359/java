package ch08.exercise;

public class pracme {
}

// @formatter:off
class A {}
class B extends A{}
class C extends B{}

interface a {}
interface b extends a {}
interface c extends a, b {}

class E implements a {}
class F implements a, b, c {}
class G extends C implements a {}

interface e extends a {}
interface f extends a, b ,c {}

// interface d implements a {} // interface implements interface X
// class D extends a {} // class extends interface X
