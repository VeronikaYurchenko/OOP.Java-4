public class Program {
    public static void main(String[] args){
        // Создаем предприятие
        Enterprise sp = new Enterprise("Super");
        // Создаем отдел и добавляем его в список отделов
        Department acc = new Department("IT");
        sp.AddDepartment(acc);
        Department teach = new Department("Finance");
        sp.AddDepartment(teach);
        // Первоначальное добавление кандидатов в отделы
        Recruitment rec = new Recruitment();
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);
        rec.setRecruitment(acc, teach);

        // Вывод в консоль списков отделов
        sp.PrintWorker();

        // Перевод сотрудника из одного отдела в другой
        Transfer tr = new Transfer();
        tr.getTransfer(sp, acc, teach);

        // Вывод в консоль списков отделов
        sp.PrintWorker();
    }

}