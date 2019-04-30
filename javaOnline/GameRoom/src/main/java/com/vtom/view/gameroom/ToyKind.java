package com.vtom.view.gameroom;

public enum ToyKind {

    //animals
    Dog(ToyType.Animals),
    Cat(ToyType.Animals),
    Penguine(ToyType.Animals),
    Lion(ToyType.Animals),

    //Cars
    Trucks(ToyType.Cars),
    RaceCars(ToyType.Cars),


    Lego(ToyType.Construction),
    Mega_blocks(ToyType.Construction),

    Barbie(ToyType.Dolls),
    AfricanDoll(ToyType.Dolls),

    Ant_Farm(ToyType.Educational),

    Robot(ToyType.Electronic),

    Chemistry_set(ToyType.Puzzle);


    private String groupName;


    ToyKind(ToyType type) {
        this.groupName = type.name();
    }

    public String getGroupName() {
        return this.groupName;
    }

}

