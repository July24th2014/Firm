package Firm.employees;

public class Executive extends Employee {
    private double bonus;
    private int extravacation = 0;

    //-----------------------------------------------------------------
    //  Constructor: Sets up this executive with the specified
    //  information.
    //-----------------------------------------------------------------
    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded

    }
    //-----------------------------------------------------------------
    //  Constructor: Sets up this executive with the specified
    //  information and additional compensated vacation days
    //-----------------------------------------------------------------
    public Executive(String eName, String eAddress, String ePhone,
                     String socSecNumber, double rate, int compVacation) {
        super(eName, eAddress, ePhone, socSecNumber, rate);

        bonus = 0;  // bonus has yet to be awarded
        extravacation = compVacation;
    }
    //-----------------------------------------------------------------
    //  Awards the specified bonus to this executive.
    //-----------------------------------------------------------------
    public void awardBonus(double execBonus) {
        bonus = execBonus;
    }

    //-----------------------------------------------------------------
    //  Computes and returns the pay for an executive, which is the
    //  regular employee payment plus a one-time bonus.
    //-----------------------------------------------------------------
    public double pay() {
        double payment = super.pay() + bonus;

        bonus = 0;

        return payment;
    }

    @Override
    public int vacation()
    {
        return STANDARD_VACATION+extravacation;
    }
}

