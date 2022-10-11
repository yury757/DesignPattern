package net.yury.P23Visitor;

public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}