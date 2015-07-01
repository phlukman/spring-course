package ca.domain.building.condition;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.MethodMetadata;

/**
 * @author patria.lukman
 */
public class BuildFourthFloorCondition implements Condition {

  /**
   * Determine if the condition matches.
   *
   * @param context  the condition context
   * @param metadata metadata of the {@link AnnotationMetadata class} or {@link MethodMetadata method} being checked.
   * @return {@code true} if the condition matches and the component can be registered or {@code false} to veto registration.
   */
  @Override
  public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
    return context.getEnvironment().getProperty("build.fourth.floor").contains("yes");
  }
}
