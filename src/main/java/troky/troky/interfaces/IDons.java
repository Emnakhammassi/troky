package troky.troky.interfaces;

import java.util.List;

public interface IDons <T> {
    public void addDons(T t);
    public void deleteDons(T t);

    public void updateDons(T t);
    public List<T> getAll();
}
