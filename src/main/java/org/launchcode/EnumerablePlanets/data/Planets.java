package org.launchcode.EnumerablePlanets.data;

public enum Planets {
    MERCURY("Mercury", 88, 2440),
    VENUS("Venus", 225, 6052),
    EARTH("Earth", 365, 6371),
    MARS("Mars", 687, 3390),
    JUPITER("Jupiter", 4333, 69911),
    SATURN("Saturn", 10759, 58232),
    URANUS("Uranus", 30687, 25362),
    NEPTUNE("Neptune", 60200, 24622);

    private final String name;
    private final int yearLength;
    private final int radius;

    Planets(String name, int yearLength, int radius) {
        this.name = name;
        this.yearLength = yearLength;
        this.radius = radius;
    }

    public String getName() {
        return name;
    }

    public int getYearLength() {
        return yearLength;
    }

    public int getRadius() {
        return radius;
    }
}
