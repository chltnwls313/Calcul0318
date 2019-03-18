package kr.hs.dgsw.webcalcul;

import org.springframework.stereotype.Service;

@Service
public class GreetingServiceImpl implements GreetingService {
    @Override
    public int sayHi(int num1, int num2, String operate){
        if (operate.equals("add"))
            return num1 + num2;
        else if (operate.equals("sub"))
            return num1 - num2;
        else if (operate.equals("mul"))
            return num1 * num2;
        else if (operate.equals("div"))
            return num1 / num2;
        return num1;
    }
}
