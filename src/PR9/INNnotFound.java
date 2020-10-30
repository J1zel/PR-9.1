package PR9;

import PR9.InnMain;

public class INNnotFound extends Exception
{
    public INNnotFound(InnMain client)
    {
        super("ИНН клиента " +client.getName()+ " не найден.");
    }
}