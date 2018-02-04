package creational;

interface Door {
    public void open();

    public int getHeight();

    public int getWidth();


}
class IronDoor implements Door
{
    public void open() {

    }

    public int getHeight() {
        return 0;
    }

    public int getWidth() {
        return 0;
    }
}

class WoodenDoor implements Door {
    int height;
    int width;

    public WoodenDoor(int height, int weight) {
        this.height = height;
        this.width = weight;
    }

    public void open() {

    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public void setWeight(int weight) {
        this.width = weight;
    }
}

class WoodenDoorFactory implements DoorFactory{
    public  Door getDoor(int height, int width) {
        return new WoodenDoor(height, width);
    }
}
interface DoorFactory{
    public  Door getDoor(int height, int width);
}

/*
here we can have multiple factoy which have their own implememtations
what we are doing here is asking a factory to give us a wooden door.
 how it gives is his option.,
 we are using interface door just to be safew but if it returbns a type of WoodendDoor then also its okay.
 but we might have multiople interface
 ex woodent door factory, streel door factory etc so all return a type of door hence door interface.
 we can even create interface DoorFactory here as well

* */