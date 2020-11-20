/**
 * коомпонент дерева
 */
public class Node {

    /**
     * определение, идем по пути или нет
     */
    private boolean goOnWay;

    /**
     * класс для задания пути в виде (1, 2)
     */
    private class Way {

        /**
         * город отправления
         */
        private int cityDeparture;

        /**
         * город прибытия
         */
        private int cityArrival;

        public Way(int cityDeparture, int cityArrival) {
            this.cityDeparture = cityDeparture;
            this.cityArrival = cityArrival;
        }

        public int getCityDeparture() {
            return cityDeparture;
        }

        public Way setCityDeparture(int cityDeparture) {
            this.cityDeparture = cityDeparture;
            return this;
        }

        public int getCityArrival() {
            return cityArrival;
        }

        public Way setCityArrival(int cityArrival) {
            this.cityArrival = cityArrival;
            return this;
        }
    }

    /**
     * путь, по которому будет передвижение
     */
    private Way way;

    public Way getWay() {
        return way;
    }

    public Node setWay(Way way) {
        this.way = way;
        return this;
    }

    public boolean isGoOnWay() {
        return goOnWay;
    }

    public Node setGoOnWay(boolean goOnWay) {
        this.goOnWay = goOnWay;
        return this;
    }

    public Node(boolean goOnWay, int cityArrival, int cityDeparture) {
        this.goOnWay = goOnWay;
        this.way =  new Way(cityDeparture, cityArrival);
    }
}
