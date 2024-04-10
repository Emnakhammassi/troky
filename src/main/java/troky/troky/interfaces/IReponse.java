package troky.troky.interfaces;

import java.util.List;

public interface IReponse  <T>{
    public void addReponse(T t);
    public void deleteReponse(T t);

    public void updateReponse(T t);
    public List<T> getDataReponse();
        }
