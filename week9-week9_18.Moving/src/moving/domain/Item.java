package moving.domain;

public class Item implements Comparable<Item>, Thing {
    private String name;
    private int volume;

    public Item(String name, int volume) {
        this.name = name;
        this.volume = volume;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return name + " (" + volume + " dm^3)";
    }

    @Override
    public int compareTo(Item comparable) {
        return this.volume - comparable.volume;
    }

    @Override
    public int getVolume() {
        return this.volume;
    }
}
