/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *Create a Cube class that represents a cube (i.e., a standard hexahedron). 
 * Create a public Cube (int edgeLength) constructor for the class, that takes the length of the cube's edge as its parameter.

Make a public int volume() method for the cube, which calculates and returns the cube's volume. 
* The volume of the cube is calculated with the formula edgeLength * edgeLength * edgeLength. 
* Moreover, make a public String toString() method for the cube, which returns a string representation of it. 
* The string representation should take the form "The length of the edge is l and the volume v", where l is the length and v the volume -
* both the length and volume must be represented as integers.
 */

public class Cube {
    private int edgeLength;

    public Cube(int edgeLength) {
        this.edgeLength = edgeLength;
    }
    
    public int volume(){
        return (int)Math.pow(edgeLength, 3);
    }
    
    @Override
    public String toString(){
        return "The length of the edge is " + edgeLength + " and the volume " + this.volume();
    }
}
