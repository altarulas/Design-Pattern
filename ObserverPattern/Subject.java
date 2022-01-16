public interface Subject {

    void follow(Observer o);
    void unfollow(Observer o);
    void notifyObservers();

}
