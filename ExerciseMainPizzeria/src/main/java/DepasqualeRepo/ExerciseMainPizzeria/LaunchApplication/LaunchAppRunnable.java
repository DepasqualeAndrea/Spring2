package DepasqualeRepo.ExerciseMainPizzeria.LaunchApplication;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

import DepasqualeRepo.ExerciseMainPizzeria.Classi.Ordine;
import DepasqualeRepo.ExerciseMainPizzeria.beans.BeensConfiguration;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class LaunchAppRunnable implements CommandLineRunner {
	private AnnotationConfigApplicationContext ctx;

	public LaunchAppRunnable() {
		ctx = new AnnotationConfigApplicationContext(BeensConfiguration.class);
	}

	@Override
	public void run(String... args) throws Exception {
		log.info(ctx.getBean("pizzaMargherita").toString());
		log.info(ctx.getBean("bevandaVino").toString());
		log.info(ctx.getBean("ingredienteFunghi").toString());
		log.info(ctx.getBean("pizzaConCotto").toString());
		log.info(ctx.getBean("pizzaCustom").toString());
		log.info(ctx.getBean("pizzaMaxi").toString());
		log.info(ctx.getBean("ordinetav1").toString() + "\n totale Ordine: "
				+ ((Ordine) ctx.getBean("ordinetav1")).totale());
	}
}
