package com.my.demo.manager;

public class a {

    // 1.加锁再进行操作
    // 2.检查beanName对应的BeanDefinition是否存在于缓存中
    // 3.如果beanName对应的合并的BeanDefinition不存在于缓存中
    // 4.如果bd的父定义的name为空，代表bd没有父定义，则使用bd新建一个RootBeanDefinition
    // 4.1 如果bd的类型为RootBeanDefinition，则直接克隆一个副本
    // 4.2 否则，则将bd作为参数，新建一个RootBeanDefinition（正常使用都会走到这边）
    // 5.否则，bd存在父定义，需要与父定义合并
    // 5.1 获取父定义的beanName
    // 5.2 如果父定义的beanName与该bean的beanName不同
    // 5.3 获取父定义的合并的BeanDefinition
    // 5.4 如果父定义的beanName与该bean的beanName相同，则拿到父BeanFactory，
    // 只有在存在父BeanFactory的情况下，才允许父定义beanName与自己相同，否则就是将自己设置为父定义
    // 5.5 如果父BeanFactory是ConfigurableBeanFactory，则通过父BeanFactory获取父定义的合并的BeanDefinition
    // 5.6 如果父BeanFactory不是ConfigurableBeanFactory，则抛异常
    // 5.7 使用父定义pbd创建一个新的RootBeanDefinition对象（深度拷贝）
    // 5.8 使用子定义bd覆盖父定义
    // 6.如果没有配置scope，则设置成默认的singleton
    // 7.如果containingBd不为空 && containingBd不为singleton && bdb为singleton，则将mdb的scope设置为containingBd的scope
    // 8.将该beanName与合并的bean定义mbd放到mergedBeanDefinitions缓存
    // 9.返回合并的BeanDefinition
}
