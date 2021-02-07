package springbootmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import springbootmongo.model.Tutorial;

import java.util.List;

//TutorialRepository, CRUD işlemleri için özel metodlar bulunduran bir interface'tir.
//Bu repository aracılığı ile veritabanındaki "Tutorial" modelindeki veriler ile etkileşim kurulacak.
/*MongoRepository'i extends edildiği için artık save(), findOne(), findById(), findAll(), count(), delete()
 ve deleteById() metodları kullanılabilecektir.*/
public interface TutorialRepository extends MongoRepository<Tutorial,String> {

    //iki tane özel finder metodu tanımladık.
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean published);
}
