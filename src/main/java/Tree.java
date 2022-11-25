public abstract class Tree {

    private Integer xPos;
    private Integer yPos;
    protected Integer sizeTree;

    public Tree(Integer xPos, Integer yPos) {
        this.xPos = xPos;
        this.yPos = yPos;
        sizeTree = 0;
    }

    public Integer getTreeSize() {
        return sizeTree;
    }

    public abstract void growth ();


}
