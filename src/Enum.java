package homework_enum.racing.transport;

public enum BodyType {
    SEDAN (name: "Седан"),
    HATCHBACK (name: "Хетчбек"),
    COUPE (name: "Купе"),
    UNIVERSAL (name: "Универсал"),
    ALLROAD (name: "Внедорожник"),
    CROSSOVER (name:"Кроссовер"),
    PICKUP (name: "Пикап"),
    VAN (name: "Фургон"),
    MINIVAN (name: "Минивэн");
    private final String name;

    BodyType (String name) { this.name=name;}
    public String getName() {return this.name;}
    public String toString() {return "Тип кузова:" + this.name;}
}