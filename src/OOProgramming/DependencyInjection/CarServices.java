package OOProgramming.DependencyInjection;

public class CarServices {
    private CarDAO carDAO;
    private EmailService emailService;
    private MOTService motService;
    public CarServices(CarDAO carDAO, EmailService emailService, MOTService motService) {
        this.carDAO = carDAO;
        this.emailService = emailService;
        this.motService = motService;
    }
}
