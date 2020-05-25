-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Tempo de geração: 30-Abr-2020 às 02:08
-- Versão do servidor: 10.4.6-MariaDB
-- versão do PHP: 7.3.9

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Banco de dados: `sicad-newton`
--

-- --------------------------------------------------------

--
-- Estrutura da tabela `aluno`
--

CREATE TABLE `aluno` (
  `ID_ALUNO` int(11) NOT NULL,
  `PESSOA_FK` int(11) NOT NULL,
  `MATRICULA` varchar(11) COLLATE utf8_bin NOT NULL,
  `SITUACAO` enum('0','1') COLLATE utf8_bin DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `aluno`
--

INSERT INTO `aluno` (`ID_ALUNO`, `PESSOA_FK`, `MATRICULA`, `SITUACAO`) VALUES
(1, 1, '11613109', '0');

-- --------------------------------------------------------

--
-- Estrutura da tabela `avaliacao`
--

CREATE TABLE `avaliacao` (
  `ID_AVALIACAO` int(11) NOT NULL,
  `ALUNO_FK` int(11) NOT NULL,
  `TURMA_FK` int(11) NOT NULL,
  `NOTA_1` smallint(6) DEFAULT NULL,
  `NOTA_2` smallint(6) DEFAULT NULL,
  `NOTA_PROVA_FINAL` smallint(6) DEFAULT NULL,
  `FREQUENCIA` tinyint(4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso`
--

CREATE TABLE `curso` (
  `ID_CURSO` int(11) NOT NULL,
  `DESCRICAO` varchar(100) COLLATE utf8_bin NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso_aluno`
--

CREATE TABLE `curso_aluno` (
  `ID_CURSO_ALUNO` int(11) NOT NULL,
  `CURSO_FK` int(11) NOT NULL,
  `ALUNO_FK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso_disciplina`
--

CREATE TABLE `curso_disciplina` (
  `ID_CURSO_DISCIPLINA` int(11) NOT NULL,
  `CURSO_FK` int(11) NOT NULL,
  `DISCIPLINA_FK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `curso_professor`
--

CREATE TABLE `curso_professor` (
  `ID_CURSO_PROFESSOR` int(11) NOT NULL,
  `CURSO_FK` int(11) NOT NULL,
  `PROFESSOR_FK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `disciplina`
--

CREATE TABLE `disciplina` (
  `ID_DISCIPLINA` int(11) NOT NULL,
  `DESCRICAO` varchar(100) COLLATE utf8_bin NOT NULL,
  `CARGA_HORARIA` tinyint(4) NOT NULL,
  `EMENTA` varchar(200) COLLATE utf8_bin DEFAULT NULL,
  `BIBLIOGRAFIA` varchar(100) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `pessoa`
--

CREATE TABLE `pessoa` (
  `ID_PESSOA` int(11) NOT NULL,
  `NOME` varchar(100) COLLATE utf8_bin NOT NULL,
  `TELEFONE` varchar(11) COLLATE utf8_bin DEFAULT 'NULL',
  `ENDERECO` varchar(100) COLLATE utf8_bin DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Extraindo dados da tabela `pessoa`
--

INSERT INTO `pessoa` (`ID_PESSOA`, `NOME`, `TELEFONE`, `ENDERECO`) VALUES
(1, 'LUIZ GUSTAVO', '3131131', 'RUA TESTE');

-- --------------------------------------------------------

--
-- Estrutura da tabela `professor`
--

CREATE TABLE `professor` (
  `ID_PROFESSOR` int(11) NOT NULL,
  `TITULACAO_MAXIMA` varchar(50) COLLATE utf8_bin NOT NULL,
  `PESSOA_FK` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- --------------------------------------------------------

--
-- Estrutura da tabela `turma`
--

CREATE TABLE `turma` (
  `ID_TURMA` int(11) NOT NULL,
  `PROFESSOR_FK` int(11) NOT NULL,
  `ANO` char(4) COLLATE utf8_bin NOT NULL,
  `SEMESTRE` enum('1','2') COLLATE utf8_bin NOT NULL,
  `DIA_SEMANAM` enum('DOMINGO','SEGUNDA-FEIRA','TERCA-FEIRA','QUARTA-FEIRA','QUINTA-FEIRA','SEXTA-FEIRA','SABADO') COLLATE utf8_bin DEFAULT NULL,
  `HORARIO` time NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

--
-- Índices para tabelas despejadas
--

--
-- Índices para tabela `aluno`
--
ALTER TABLE `aluno`
  ADD PRIMARY KEY (`ID_ALUNO`),
  ADD KEY `PESSOA_FK` (`PESSOA_FK`);

--
-- Índices para tabela `avaliacao`
--
ALTER TABLE `avaliacao`
  ADD PRIMARY KEY (`ID_AVALIACAO`),
  ADD KEY `ALUNO_FK` (`ALUNO_FK`),
  ADD KEY `TURMA_FK` (`TURMA_FK`);

--
-- Índices para tabela `curso`
--
ALTER TABLE `curso`
  ADD PRIMARY KEY (`ID_CURSO`);

--
-- Índices para tabela `curso_aluno`
--
ALTER TABLE `curso_aluno`
  ADD PRIMARY KEY (`ID_CURSO_ALUNO`),
  ADD KEY `CURSO_FK` (`CURSO_FK`),
  ADD KEY `ALUNO_FK` (`ALUNO_FK`);

--
-- Índices para tabela `curso_disciplina`
--
ALTER TABLE `curso_disciplina`
  ADD PRIMARY KEY (`ID_CURSO_DISCIPLINA`),
  ADD KEY `CURSO_FK` (`CURSO_FK`),
  ADD KEY `DISCIPLINA_FK` (`DISCIPLINA_FK`);

--
-- Índices para tabela `curso_professor`
--
ALTER TABLE `curso_professor`
  ADD PRIMARY KEY (`ID_CURSO_PROFESSOR`),
  ADD KEY `CURSO_FK` (`CURSO_FK`),
  ADD KEY `PROFESSOR_FK` (`PROFESSOR_FK`);

--
-- Índices para tabela `disciplina`
--
ALTER TABLE `disciplina`
  ADD PRIMARY KEY (`ID_DISCIPLINA`);

--
-- Índices para tabela `pessoa`
--
ALTER TABLE `pessoa`
  ADD PRIMARY KEY (`ID_PESSOA`);

--
-- Índices para tabela `professor`
--
ALTER TABLE `professor`
  ADD PRIMARY KEY (`ID_PROFESSOR`),
  ADD KEY `PESSOA_FK` (`PESSOA_FK`);

--
-- Índices para tabela `turma`
--
ALTER TABLE `turma`
  ADD PRIMARY KEY (`ID_TURMA`),
  ADD KEY `PROFESSOR_FK` (`PROFESSOR_FK`);

--
-- AUTO_INCREMENT de tabelas despejadas
--

--
-- AUTO_INCREMENT de tabela `aluno`
--
ALTER TABLE `aluno`
  MODIFY `ID_ALUNO` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `avaliacao`
--
ALTER TABLE `avaliacao`
  MODIFY `ID_AVALIACAO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `curso`
--
ALTER TABLE `curso`
  MODIFY `ID_CURSO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `curso_aluno`
--
ALTER TABLE `curso_aluno`
  MODIFY `ID_CURSO_ALUNO` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `curso_disciplina`
--
ALTER TABLE `curso_disciplina`
  MODIFY `ID_CURSO_DISCIPLINA` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `curso_professor`
--
ALTER TABLE `curso_professor`
  MODIFY `ID_CURSO_PROFESSOR` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `disciplina`
--
ALTER TABLE `disciplina`
  MODIFY `ID_DISCIPLINA` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `pessoa`
--
ALTER TABLE `pessoa`
  MODIFY `ID_PESSOA` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- AUTO_INCREMENT de tabela `professor`
--
ALTER TABLE `professor`
  MODIFY `ID_PROFESSOR` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT de tabela `turma`
--
ALTER TABLE `turma`
  MODIFY `ID_TURMA` int(11) NOT NULL AUTO_INCREMENT;

--
-- Restrições para despejos de tabelas
--

--
-- Limitadores para a tabela `aluno`
--
ALTER TABLE `aluno`
  ADD CONSTRAINT `aluno_ibfk_1` FOREIGN KEY (`PESSOA_FK`) REFERENCES `pessoa` (`ID_PESSOA`);

--
-- Limitadores para a tabela `avaliacao`
--
ALTER TABLE `avaliacao`
  ADD CONSTRAINT `avaliacao_ibfk_1` FOREIGN KEY (`ALUNO_FK`) REFERENCES `aluno` (`ID_ALUNO`),
  ADD CONSTRAINT `avaliacao_ibfk_2` FOREIGN KEY (`TURMA_FK`) REFERENCES `turma` (`ID_TURMA`);

--
-- Limitadores para a tabela `curso_aluno`
--
ALTER TABLE `curso_aluno`
  ADD CONSTRAINT `curso_aluno_ibfk_1` FOREIGN KEY (`CURSO_FK`) REFERENCES `curso` (`ID_CURSO`),
  ADD CONSTRAINT `curso_aluno_ibfk_2` FOREIGN KEY (`ALUNO_FK`) REFERENCES `aluno` (`ID_ALUNO`);

--
-- Limitadores para a tabela `curso_disciplina`
--
ALTER TABLE `curso_disciplina`
  ADD CONSTRAINT `curso_disciplina_ibfk_1` FOREIGN KEY (`CURSO_FK`) REFERENCES `curso` (`ID_CURSO`),
  ADD CONSTRAINT `curso_disciplina_ibfk_2` FOREIGN KEY (`DISCIPLINA_FK`) REFERENCES `disciplina` (`ID_DISCIPLINA`);

--
-- Limitadores para a tabela `curso_professor`
--
ALTER TABLE `curso_professor`
  ADD CONSTRAINT `curso_professor_ibfk_1` FOREIGN KEY (`CURSO_FK`) REFERENCES `curso` (`ID_CURSO`),
  ADD CONSTRAINT `curso_professor_ibfk_2` FOREIGN KEY (`PROFESSOR_FK`) REFERENCES `professor` (`ID_PROFESSOR`);

--
-- Limitadores para a tabela `professor`
--
ALTER TABLE `professor`
  ADD CONSTRAINT `professor_ibfk_1` FOREIGN KEY (`PESSOA_FK`) REFERENCES `pessoa` (`ID_PESSOA`);

--
-- Limitadores para a tabela `turma`
--
ALTER TABLE `turma`
  ADD CONSTRAINT `turma_ibfk_1` FOREIGN KEY (`PROFESSOR_FK`) REFERENCES `professor` (`ID_PROFESSOR`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
