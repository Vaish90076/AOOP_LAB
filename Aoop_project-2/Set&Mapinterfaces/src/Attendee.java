class Attendee {
    private String name;

    public Attendee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Attendee attendee = (Attendee) o;
        return name.equals(attendee.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}