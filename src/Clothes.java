public abstract class Clothes {
    private Pocket leftPocket;
    private Pocket rightPocket;

    public Clothes(Pocket leftPocket, Pocket rightPocket) {
        this.leftPocket = leftPocket;
        this.rightPocket = rightPocket;
    }

    public Clothes() {
        this.leftPocket = new LeftPocket();
        this.rightPocket = new RightPocket();
    }

    public Pocket getLeftPocket() {
        return leftPocket;
    }

    public void setLeftPocket(Pocket leftPocket) {
        this.leftPocket = leftPocket;
    }

    public Pocket getRightPocket() {
        return rightPocket;
    }

    public void setRightPocket(Pocket rightPocket) {
        this.rightPocket = rightPocket;
    }

    @Override
    public String toString() {
        return "В левом кармане лежат: " + leftPocket.getObjects().size() + " предмета" +
                "\nВ левом кармане лежит: " + leftPocket.Сonnect() +
                "\nВ правом кармане лежат: " + rightPocket.getObjects().size() + " предмета" +
                "\nВ правом кармане лежит: " + rightPocket.Сonnect();

    }
}
