package com.mkdika.springzk85todo.viewmodel;

import com.mkdika.springzk85todo.model.Task;
import com.mkdika.springzk85todo.repository.TaskRepository;
import java.util.List;
import lombok.Data;
import org.apache.commons.collections4.IteratorUtils;
import org.zkoss.bind.annotation.Init;
import org.zkoss.zk.ui.select.annotation.VariableResolver;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zkplus.spring.DelegatingVariableResolver;
import org.zkoss.zul.ListModelList;

/**
 *
 * @author Maikel Chandika <mkdika@gmail.com>
 */
@Data
@VariableResolver(DelegatingVariableResolver.class)
public class IndexVm {

    @WireVariable
    private TaskRepository taskRepository;

    private List<Task> taskListModel;
    
    private String testing;

    @Init
    public void init() {
        List<Task> list = IteratorUtils.toList(taskRepository.findAll().iterator());
        System.out.println(">>>> SIZE: " + list.size());
        setTaskListModel(list);
        
        testing = "Hello Worldxxx";
        setTesting(testing);
    }

}
