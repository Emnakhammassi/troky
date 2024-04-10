package troky.troky.interfaces;

import java.util.List;

public interface IReclamation <T> {
    public void addReclamation(T t);
    public void deleteReclamation(T t);

    public void updateReclamation(T t);
    public List<T> getData();
}
