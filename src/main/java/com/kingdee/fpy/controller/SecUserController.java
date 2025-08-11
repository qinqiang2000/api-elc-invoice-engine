package com.kingdee.fpy.controller;

import com.kingdee.fpy.commom.Result;
import com.kingdee.fpy.commom.ResultPage;
import com.kingdee.fpy.model.SecUser;
import com.kingdee.fpy.service.SecUserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * SecUser控制器
 * 自动生成，请勿手动修改
 */
@Slf4j
@RestController
@RequestMapping("/api/sec-user")
public class SecUserController {

    @Autowired
    private SecUserService secUserService;

    /**
     * 根据主键查询用户
     * @param id 用户ID
     * @return 用户信息
     */
    @GetMapping("/{id}")
    public Result<SecUser> selectByPrimaryKey(@PathVariable Long id) {
        log.info("根据主键查询用户，ID：{}", id);

        try {
            if (id == null) {
                return Result.error("用户ID不能为空");
            }

            SecUser user = secUserService.selectByPrimaryKey(id);
            if (user != null) {
                return Result.success(user);
            } else {
                return Result.error("用户不存在");
            }

        } catch (Exception e) {
            log.error("查询用户失败，ID：{}", id, e);
            return Result.error("查询用户失败：" + e.getMessage());
        }
    }

    /**
     * 查询所有用户
     * @return 用户列表
     */
    @GetMapping("/all")
    public Result<List<SecUser>> selectAll() {
        log.info("查询所有用户");

        try {
            List<SecUser> users = secUserService.selectAll();
            return Result.success(users);

        } catch (Exception e) {
            log.error("查询所有用户失败", e);
            return Result.error("查询用户失败：" + e.getMessage());
        }
    }

    /**
     * 根据条件查询用户
     * @param condition 查询条件
     * @return 用户列表
     */
    @PostMapping("/search")
    public Result<List<SecUser>> selectByCondition(@RequestBody Map<String, Object> condition) {
        log.info("根据条件查询用户，条件：{}", condition);

        try {
            List<SecUser> users = secUserService.selectByCondition(condition);
            return Result.success(users);

        } catch (Exception e) {
            log.error("根据条件查询用户失败，条件：{}", condition, e);
            return Result.error("查询用户失败：" + e.getMessage());
        }
    }

    /**
     * 根据条件统计用户数量
     * @param condition 查询条件
     * @return 用户数量
     */
    @PostMapping("/count")
    public Result<Integer> countByCondition(@RequestBody Map<String, Object> condition) {
        log.info("根据条件统计用户数量，条件：{}", condition);

        try {
            int count = secUserService.countByCondition(condition);
            return Result.success(count);

        } catch (Exception e) {
            log.error("统计用户数量失败，条件：{}", condition, e);
            return Result.error("统计用户数量失败：" + e.getMessage());
        }
    }

    /**
     * 插入用户
     * @param record 用户信息
     * @return 操作结果
     */
    @PostMapping("/insert")
    public Result<SecUser> insert(@RequestBody SecUser record) {
        log.info("插入用户：{}", record);

        try {
            if (record == null) {
                return Result.error("用户信息不能为空");
            }

            // 使用insertAndSelect方法，插入后返回完整信息
            SecUser insertedUser = secUserService.insertAndSelect(record);
            if (insertedUser != null) {
                log.info("用户插入成功，ID：{}", insertedUser.getId());
                return Result.success(insertedUser);
            } else {
                return Result.error("插入用户失败");
            }

        } catch (Exception e) {
            log.error("插入用户失败", e);
            return Result.error("插入用户失败：" + e.getMessage());
        }
    }

    /**
     * 选择性插入用户
     * @param record 用户信息
     * @return 操作结果
     */
    @PostMapping("/insert-selective")
    public Result<SecUser> insertSelective(@RequestBody SecUser record) {
        log.info("选择性插入用户：{}", record);

        try {
            if (record == null) {
                return Result.error("用户信息不能为空");
            }

            // 使用insertSelectiveAndSelect方法，插入后返回完整信息
            SecUser insertedUser = secUserService.insertSelectiveAndSelect(record);
            if (insertedUser != null) {
                log.info("用户选择性插入成功，ID：{}", insertedUser.getId());
                return Result.success(insertedUser);
            } else {
                return Result.error("选择性插入用户失败");
            }

        } catch (Exception e) {
            log.error("选择性插入用户失败", e);
            return Result.error("选择性插入用户失败：" + e.getMessage());
        }
    }

    /**
     * 根据主键更新用户
     * @param record 用户信息
     * @return 操作结果
     */
    @PutMapping("/update")
    public Result<String> updateByPrimaryKey(@RequestBody SecUser record) {
        log.info("根据主键更新用户：{}", record);

        try {
            if (record == null || record.getId() == null) {
                return Result.error("用户信息或ID不能为空");
            }

            int result = secUserService.updateByPrimaryKey(record);
            if (result > 0) {
                return Result.success("更新用户成功");
            } else {
                return Result.error("更新用户失败，用户可能不存在");
            }

        } catch (Exception e) {
            log.error("更新用户失败", e);
            return Result.error("更新用户失败：" + e.getMessage());
        }
    }

    /**
     * 根据主键选择性更新用户
     * @param record 用户信息
     * @return 操作结果
     */
    @PutMapping("/update-selective")
    public Result<String> updateByPrimaryKeySelective(@RequestBody SecUser record) {
        log.info("根据主键选择性更新用户：{}", record);

        try {
            if (record == null || record.getId() == null) {
                return Result.error("用户信息或ID不能为空");
            }

            int result = secUserService.updateByPrimaryKeySelective(record);
            if (result > 0) {
                return Result.success("选择性更新用户成功");
            } else {
                return Result.error("选择性更新用户失败，用户可能不存在");
            }

        } catch (Exception e) {
            log.error("选择性更新用户失败", e);
            return Result.error("选择性更新用户失败：" + e.getMessage());
        }
    }

    /**
     * 根据主键删除用户
     * @param id 用户ID
     * @return 操作结果
     */
    @DeleteMapping("/{id}")
    public Result<String> deleteByPrimaryKey(@PathVariable Long id) {
        log.info("根据主键删除用户，ID：{}", id);

        try {
            if (id == null) {
                return Result.error("用户ID不能为空");
            }

            int result = secUserService.deleteByPrimaryKey(id);
            if (result > 0) {
                return Result.success("删除用户成功");
            } else {
                return Result.error("删除用户失败，用户可能不存在");
            }

        } catch (Exception e) {
            log.error("删除用户失败，ID：{}", id, e);
            return Result.error("删除用户失败：" + e.getMessage());
        }
    }

    /**
     * 批量删除用户
     * @param ids 用户ID列表
     * @return 操作结果
     */
    @DeleteMapping("/batch")
    public Result<String> deleteByIds(@RequestBody List<Long> ids) {
        log.info("批量删除用户，IDs：{}", ids);

        try {
            if (ids == null || ids.isEmpty()) {
                return Result.error("用户ID列表不能为空");
            }

            int result = secUserService.deleteByIds(ids);
            if (result > 0) {
                return Result.success("批量删除用户成功，删除数量：" + result);
            } else {
                return Result.error("批量删除用户失败");
            }

        } catch (Exception e) {
            log.error("批量删除用户失败，IDs：{}", ids, e);
            return Result.error("批量删除用户失败：" + e.getMessage());
        }
    }

    /**
     * 测试插入并查询功能
     * @param record 用户信息
     * @return 插入后查询到的完整用户信息
     */
    @PostMapping("/test-insert-and-select")
    public Result<Map<String, Object>> testInsertAndSelect(@RequestBody SecUser record) {
        log.info("测试插入并查询功能：{}", record);

        try {
            if (record == null) {
                return Result.error("用户信息不能为空");
            }

            // 1. 选择性插入用户
            SecUser insertedUser = secUserService.insertSelectiveAndSelect(record);
            if (insertedUser == null) {
                return Result.error("插入用户失败");
            }

            // 2. 再次根据主键查询，验证数据一致性
            SecUser queriedUser = secUserService.selectByPrimaryKey(insertedUser.getId());

            // 3. 构建返回结果
            Map<String, Object> result = new HashMap<>();
            result.put("insertedUser", insertedUser);
            result.put("queriedUser", queriedUser);
            result.put("dataConsistent", insertedUser.equals(queriedUser));
            result.put("message", "插入成功，数据可正常查询");

            log.info("测试完成，插入用户ID：{}，数据一致性：{}",
                    insertedUser.getId(), insertedUser.equals(queriedUser));

            return Result.success(result);

        } catch (Exception e) {
            log.error("测试插入并查询功能失败", e);
            return Result.error("测试失败：" + e.getMessage());
        }
    }
}