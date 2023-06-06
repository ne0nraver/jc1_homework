package part9.task36;

public enum Season {
    SUMMER("представляет время года, которое следует за весной и предшествует осени. Для него характерны высокие температуры и дни дольше, чем ночи. На этой станции обычно много осадков. В Северном полушарии он обычно начинается примерно 21 июня и заканчивается примерно 23 сентября. Лето в Северном полушарии называют северным летом.", 94, "Summer", 1),
    AUTUMN("представляет время года, которое следует за летом и предшествует зиме. Это период года, когда температура начинает падать, за исключением регионов, расположенных близко к экватору. В это время года листья деревьев имеют желтоватый оттенок и опадают, что свидетельствует о смене сезона на сезон. Поэтому осень считается переходным периодом. В Северном полушарии он обычно начинается 23 сентября и заканчивается примерно 21 декабря. Это называется северной осенью.", 89, "Autumn", 2),
    WINTER("представляет время года, которое следует за осенью и предшествует весне. Для него характерны самые низкие температуры в году. В это время животные часто мигрируют в регионы с более высокими температурами. В некоторых местах в этот сезон бывают заморозки и снегопады. Для него также характерны более длинные ночи, чем дни, из-за меньшего количества солнечного света в регионе, где он действует. В Северном полушарии это известно как северная зима. Он начинается примерно 21 декабря и заканчивается примерно 20 марта." , 89, "Winter", 3),
    SPRING("представляет время года, которое следует за зимой и предшествует лету. Для него характерны более мягкие и приятные температуры, поскольку количество осадков начинает увеличиваться. В это время года дни начинают удлиняться, а ночь сокращаться. Также для него характерно возрождение наземной флоры. В Северном полушарии он известен как северный источник. Он начинается примерно 20 марта и заканчивается примерно 21 июня.", 93, "Spring", 4);
    private String description;
    private int countOfDays;
    private int id;
    String inPut;

    Season(String description, int countOfDays, String inPut, int id) {
        this.description = description;
        this.countOfDays = countOfDays;
        this.inPut = inPut;
        this.id = id;
    }

    public String getInPut() {
        return inPut;
    }


    public String getDescription() {
        return description;
    }

    public int getCountOfDays() {
        return countOfDays;
    }

    public int getId() {
        return id;
    }
}