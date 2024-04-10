package troky.troky.interfaces;

import java.util.List;

public interface IUtilisateur  <T> {
    public void addUtilisateur(T t);
    public void deleteUtilisateur(T t);

    public void updateUtilisateur(T t);
    public List<T> getAll();
}
