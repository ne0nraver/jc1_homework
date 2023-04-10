package lesson10;

public enum PizzaOrderStatus {

    NewOrder(360, true),
    Cooking(15 * 60, true),
    Delivery(30 * 60, false),
    Payment(5 * 60, false);

    private int maxExecutionTime;
    private boolean canCancel;
    private Progress progress;

    PizzaOrderStatus(int maxExecutionTime,
                     boolean canCancel) {
        this.maxExecutionTime = maxExecutionTime;
        this.canCancel = canCancel;
    }

    public int getMaxExecutionTime() {
        return maxExecutionTime;
    }

    public boolean isCanCancel() {
        return canCancel;
    }


   public Progress getProgress() {
        return progress;
    }

    public void setProgress(Progress progress) {
        this.progress = progress;
    }

}
    enum Progress {
        START, IN_PROGRESS, FINISH;
    }

