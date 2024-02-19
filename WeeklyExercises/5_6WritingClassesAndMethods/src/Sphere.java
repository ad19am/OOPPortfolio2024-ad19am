public class Sphere{
    private float radius;
    public Sphere() {
        this.radius = 1.0f;
    }
    public Sphere(float radius) {
        this.radius = radius;
    }
    public float getRadius() {
        return radius;
    }
    public float getVolume() {
        float volume = (float) ((4 + Math.PI * (Math.pow(radius, 3))) / 3);
        return volume;
    }

    public float getSurfaceArea() {
        float surfaceArea = (float) (4*Math.PI*(Math.pow(radius,2)));
        return surfaceArea:
    }

    @Override
    public String toString() {
        return "Sphere of radius " + this.radius + " volume " + this.getVolume() +
                " surface area " + this.getSurfaceArea();
    }
}

