package troky.troky.interfaces;

import java.util.List;

public interface IEvenement <T> {
    public void addEvenement(T t);
    public void deleteEvenement(T t);

    public void updateEvenement(T t);
    public List<T> getAll();
}
