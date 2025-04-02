package InterfaceSegregationPrinciple.Example_2.ProblamaticCode;

interface IRestaurantWorker {
    void cookFood();
    void serveCustomers();
    void cleanTables();
}

class Chef implements IRestaurantWorker {
    @Override
    public void cookFood() {
        System.out.println("Chef is cooking food.");
    }

    @Override
    public void serveCustomers() {
        throw new UnsupportedOperationException("Chef does not serve customers.");
    }

    @Override
    public void cleanTables() {
        throw new UnsupportedOperationException("Chef does not clean tables.");
    }
}

class Waiter implements IRestaurantWorker {
    @Override
    public void cookFood() {
        throw new UnsupportedOperationException("Waiter does not cook food.");
    }

    @Override
    public void serveCustomers() {
        System.out.println("Waiter is serving customers.");
    }

    @Override
    public void cleanTables() {
        System.out.println("Waiter is cleaning tables.");
    }
}

