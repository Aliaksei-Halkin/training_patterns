package com.epam.patterns.creational.fatory;

/**
 * Используется, когда у нас есть суперкласс с несколькими подклассами и на основе ввода, нам нужно вернуть один из
 * подкласса. Класс не знает какого типа объект он должен создать. Объекты создаются в зависимости от входящих данных.
 */
public class Factory {
    public OperationSystem getCurrentOS(String inputOs) {
        OperationSystem operationSystem = null;
        if (inputOs.equals("windows")) {
            operationSystem = new Windows();
        } else if (inputOs.equals("linux")) {
            operationSystem = new Linux();
        }
        return operationSystem;
    }
}
