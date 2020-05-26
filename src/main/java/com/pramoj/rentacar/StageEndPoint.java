/**
 * ============================
 * Author - Pramoj Kumararathna
 * On     - 2020-05-26
 * At     - 01:25
 * ============================
 */

package com.pramoj.rentacar;

import org.springframework.boot.actuate.endpoint.annotation.DeleteOperation;
import org.springframework.boot.actuate.endpoint.annotation.Endpoint;
import org.springframework.boot.actuate.endpoint.annotation.ReadOperation;
import org.springframework.boot.actuate.endpoint.annotation.Selector;
import org.springframework.boot.actuate.endpoint.annotation.WriteOperation;
import org.springframework.stereotype.Component;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@Endpoint(id="stage")
public class StageEndPoint {

    Map<String, Stage> stages = new ConcurrentHashMap<>();

    @ReadOperation
    public Map<String, Stage> getAllStages() {
        return stages;
    }

    @ReadOperation
    public Stage getStage(@Selector String name) {
        return stages.get(name);
    }

    @WriteOperation
    public void setValue(@Selector String name, int stage) {
        stages.put(name, new Stage(stage));
    }

    @DeleteOperation
    public void deleteValue(@Selector String name) {
        stages.remove(name);
    }

    static class Stage {

        int value;

        public Stage(int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
