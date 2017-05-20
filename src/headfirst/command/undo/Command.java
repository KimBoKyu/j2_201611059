package headfirst.command.undo;

public interface Command{
  public void excute();
  public void undo();
}